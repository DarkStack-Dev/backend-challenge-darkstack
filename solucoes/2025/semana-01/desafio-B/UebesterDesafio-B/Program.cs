
using UebesterDesafio_B.Context;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Options;
using UebesterDesafio_B.ModelsViews;

var builder = WebApplication.CreateBuilder(args);

// Configura o DbContext (EF Core com SQL Server)
builder.Services.AddDbContext<BibliotecaContext>(options =>
    options.UseSqlServer(builder.Configuration.GetConnectionString("ConectarSql")));

// Adiciona os serviços essenciais da API
builder.Services.AddControllers(); 
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

#region Home
app.MapGet("/", () => Results.Json(new Home()));
#endregion

// Configuração do Swagger
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

// Middleware
app.UseHttpsRedirection();
app.UseAuthorization();

// Mapeia os controllers para rotas da API
app.MapControllers();

app.Run();
